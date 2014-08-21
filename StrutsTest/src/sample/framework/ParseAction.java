package sample.framework;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ParseAction extends Action {
    public ActionForward execute(
        ActionMapping mapping,
        ActionForm form,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        ParseActionForm parseform = (ParseActionForm)form;
        for(InputLine inputLine : parseform.getList()){
            String input = inputLine.getInput();
            String output;
            int inRadix = Integer.parseInt(inputLine.getInRadix());
            int outRadix = Integer.parseInt(inputLine.getOutRadix());

            try {
                int tmp = Integer.parseInt(input, inRadix);
                output = Integer.toString(tmp, outRadix).toUpperCase();
            } catch(NumberFormatException nfe) {
                output = "Error!";
            }

            inputLine.setOutput(output);
        }
        return mapping.getInputForward();
    }
}