package Services;



import java.util.logging.Logger;

import org.springframework.stereotype.Service;
import model.Comment;


@Service	
public class CommentService {
	
	
	  private Logger logger = Logger.getLogger(CommentService.class.getName());

	
	public void publishComment(Comment comment) {
		logger.info("Publicshin comment: " + comment.getText());
	
	}
	
	public void setLogger(Logger logger){
		this.logger=logger;
		
		
	}

}
