package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class boardWriteServlet
 */
public class boardWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public boardWriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/boardWrite.jsp");
		rd.forward(request, response);
		
//		PrintWriter out = response.getWriter();
//		out.println("<!DOCTYPE html>                                                                                           ");
//		out.println("<html>                                                                                                    ");
//		out.println("<head>                                                                                                    ");
//		out.println("<meta charset=\"UTF-8\">                                                                                    ");
//		out.println("<title>Insert title here</title>                                                                          ");
//		out.println("</head>                                                                                                   ");
//		out.println("<style>                                                                                                   ");
//		out.println("	.write_wrap{                                                                                           ");
//		out.println("		margin: auto;	                                                                                   ");
//		out.println("	}                                                                                                      ");
//		out.println("	                                                                                                       ");
//		out.println("	                                                                                                       ");
//		out.println("	.con_wrap {                                                                                            ");
//		out.println("		width: 800px;                                                                                      ");
//		out.println("		height: 400px;                                                                                     ");
//		out.println("	}                                                                                                      ");
//		out.println("	                                                                                                       ");
//		out.println("	textarea {                                                                                             ");
//		out.println("		width: 100%;                                                                                       ");
//		out.println("		height:80%;                                                                                       ");
//		out.println("		resize: none;			                                                                           ");
//		out.println("	}                                                                                                      ");
//		out.println("</style>                                                                                                  ");
//		out.println("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-latest.min.js\"></script>                ");
//		out.println("<script type=\"text/javascript\">                                                                           ");
//		out.println("$(document).ready(function(){                                                                             ");
//		out.println("	$(\"#b_con\").on(\"keyup\",function(){                                                                     ");
//		out.println("		$(\"#text_cnt\").html(\"(\"+$(this).val().length+\" / 2000)\");                                          ");
//		out.println("		                                                                                                   ");
//		out.println("		if($(this).val().length > 2000){                                                                   ");
//		out.println("			$(this).val($(this).val().substring(0,2000));                                                  ");
//		out.println("			$(\"#text_cnt\").html(\"(2000 / 2000)\");			                                               ");
//		out.println("		}                                                                                                  ");
//		out.println("	});                                                                                                    ");
//		out.println("	                                                                                                       ");
//		out.println("	$(\"#write_btn\").on(\"click\",function(){                                                                 ");
//		out.println("		$(\"#write_form\").submit();                                                                         ");
//		out.println("	});                                                                                                    ");
//		out.println("	                                                                                                       ");
//		out.println("	$(\"#back_btn\").on(\"click\",function(){                                                                  ");
//		out.println("		history.back();                                                                                    ");
//		out.println("	});                                                                                                    ");
//		out.println("});                                                                                                       ");
//		out.println("</script>                                                                                                 ");
//		out.println("<body>                                                                                                    ");
//		out.println("<div class=\"write_wrap\">                                                                                  ");
//		out.println("	<form action=\"boardInsert.do\" id=\"write_form\" method=\"post\">                                                ");
//		out.println("		<div class=\"title_wrap\">                                                                           ");
//		out.println("			<input type=\"text\" id=\"b_title\" name=\"b_title\" placeholder=\"제목을 입력해주세요.\">             ");
//		out.println("		</div>                                                                                             ");
//		out.println("		<div class=\"writer_wrap\">                                                                          ");
//		out.println("			<input type=\"text\" id=\"b_writer\" name=\"b_writer\" placeholder=\"이름을 입력해주세요.\">           ");
//		out.println("		</div>                                                                                             ");
//		out.println("		<div class=\"con_wrap\">                                                                             ");
//		out.println("			<textarea rows=\"\" cols=\"\" id=\"b_con\" name=\"b_con\" placeholder=\"내용을 입력해주세요.\"></textarea>");
//		out.println("			<div id=\"text_cnt\">(0 / 2000)</div>                                                            ");
//		out.println("		</div>                                                                                             ");
//		out.println("	</form>                                                                                                ");
//		out.println("<div class=\"btn_wrap\">");
//		out.println("	<button type=\"button\" id=\"write_btn\">글쓰기</button>                                                   ");
//		out.println("	<button type=\"button\" id=\"back_btn\">목록</button>                                                      ");
//		out.println("</div>                                                                                                    ");
//		out.println("</div>                                                                                                    ");
//		out.println("</body>                                                                                                   ");
//		out.println("</html>                                                                                                   ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
