package sec01.ex01;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


@WebServlet("/upload.do")
public class FileUpload extends HttpServlet {
	
    public FileUpload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request,response);
	}
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String encoding = "utf-8";
		File currentDirPath = new File("C:\\file_repo_javaweb"); //이 경로에 파일을 넣어줄거야.
		DiskFileItemFactory factory = new DiskFileItemFactory(); //파일 업로드 api에서 제공하는 클래스 중 하나인 diskFileItemFactory를 이용해 저장위치와 최대파일설정하기
		factory.setRepository(currentDirPath);//파일 경로를 설정할거야.
		factory.setSizeThreshold(1024*1024);//파일 크기 최대업로드크기로 설정할거야.
		ServletFileUpload upload = new ServletFileUpload(factory); //파일 업로드 api에서 제공하는 클래스 중 하나인 ServletFileUpload를 이용해 업로드된 파일과 매개변수에 대한 정보 가져오기
		try {
			List items = upload.parseRequest(request); //request객체에 매개변수를 list로 가져온다,
			for(int i = 0; i<items.size(); i++) {
				FileItem fileItem = (FileItem)items.get(i); //파일 업로드창에서 업로드된 항목들을 하나씩 가져와
				if(fileItem.isFormField()) { //폼 필드이면 전송된 매개변수 값을 출력
					System.out.println(fileItem.getFieldName()+ "=" +fileItem.getString(encoding));
				}else {
					System.out.println("매개변수이름:" + fileItem.getFieldName());
					System.out.println("파일이름:" + fileItem.getName());
					System.out.println("파일크기:" + fileItem.getSize() + "bytes");
					if(fileItem.getSize() > 0) {
						int idx = fileItem.getName().lastIndexOf("\\");
						if(idx == -1) {
							idx = fileItem.getName().lastIndexOf("/");
						}
						String fileName = fileItem.getName().substring(idx+1);
						File uploadFile = new File(currentDirPath + "\\" + fileName);
						fileItem.write(uploadFile); //업로드한 파일 이름으로 저장소에 파일을 업로드한다.
					} //end if //폼 필드가 아니면 파일 업로드 기능을 수행 + 업로드한 파일 이름 가져오기
				}//end if
			}//end for
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
