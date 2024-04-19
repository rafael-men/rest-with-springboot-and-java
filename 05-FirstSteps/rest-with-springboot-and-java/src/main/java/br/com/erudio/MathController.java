package br.com.erudio;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exceptions.UnsupportedMathOperationException;

@RestController
public class MathController {
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public double sum(
			@PathVariable(value="numberOne") String numberOne,
			@PathVariable(value="numberTwo") String numberTwo
	    ) throws Exception {
			
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric Value");
		}
		return ConvertToDouble(numberOne) + ConvertToDouble(numberTwo);
	}
	
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public double subtraction(
			@PathVariable(value="numberOne") String numberOne,
			@PathVariable(value="numberTwo") String numberTwo
	    ) throws Exception {
			
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric Value");
		}
		return ConvertToDouble(numberOne) - ConvertToDouble(numberTwo);
	}
	
	@RequestMapping(value = "/mul/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public double multiplication(
			@PathVariable(value="numberOne") String numberOne,
			@PathVariable(value="numberTwo") String numberTwo
	    ) throws Exception {
			
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric Value");
		}
		return ConvertToDouble(numberOne) * ConvertToDouble(numberTwo);
	}
	
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public double division(
			@PathVariable(value="numberOne") String numberOne,
			@PathVariable(value="numberTwo") String numberTwo
	    ) throws Exception {
			
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric Value");
		}
		return ConvertToDouble(numberOne) / ConvertToDouble(numberTwo);
	}
	
	@RequestMapping(value = "/med/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public double media(
			@PathVariable(value="numberOne") String numberOne,
			@PathVariable(value="numberTwo") String numberTwo
	    ) throws Exception {
			
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric Value");
		}
		return (ConvertToDouble(numberOne) + ConvertToDouble(numberTwo)) / 2;
	}
	
	
	
	private double ConvertToDouble(String strNumber) {
		if(strNumber == null) return 0D;
		String Number = strNumber.replaceAll(",", ".");
		if(isNumeric(Number)) return Double.parseDouble(Number);
		return 0D;
	}
	private boolean isNumeric(String strNumber) {
		if(strNumber == null) return false;
		String Number = strNumber.replaceAll(",",".");
		return Number.matches("[+-]?[0-9]*\\.?[0-9]+");
	}
}
	   
