package sample.framework;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;


/**
 * евепе╖ечеєе╒ейй`ер
 * @author Ryu
 *
 */
public class ParseActionForm extends ActionForm {
    private static final long serialVersionUID = 1L;

    private List<InputLine> list = new ArrayList<InputLine>();
    
    public ParseActionForm() {
        list.add(new InputLine());
        list.add(new InputLine());
        list.add(new InputLine());
    }

    public List<InputLine> getList() {
        return list;
    }
    
    public void setList(List<InputLine> values) {
        list = values;
    }
 
    public InputLine getList(int idx) {
        while(list.size() <= idx) {
            this.list.add(new InputLine());
        }
        
        return list.get(idx);
    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        super.reset(mapping, request);
        try {
            request.setCharacterEncoding("utf-8");
        } catch(UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
    }
}