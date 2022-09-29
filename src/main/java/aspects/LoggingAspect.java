package aspects;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect{
	private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
	
	
	@Around("execution(* Services.*.*(..))")            
	public void log(ProceedingJoinPoint joinPoint) throws Throwable {
	    logger.info("Method will execute");                              
		joinPoint.proceed();
		logger.info("Method excuted");
		
	}
	public void setLogger(Logger logger) {
		this.logger =logger;
	}

}
