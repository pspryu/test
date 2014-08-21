<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!doctype html>
<html:html lang="true">
    <head>
        <title>進数変換</title>
        <link rel="stylesheet" href="parse.css" type="text/css">
    </head>
    <body>
        <html:form action="action.do" method="post">
            <logic:iterate id="list" name="parseform" property="list"
            type="sample.framework.InputLine">
            <div>
                <fieldset>
                    <legend>input</legend>
                    <html:text name="list" property="input" size="30" indexed="true"/><br>
                    <html:radio name="list" property="inRadix" indexed="true" value="2">bin</html:radio>
                    <html:radio name="list" property="inRadix" indexed="true" value="8">oct</html:radio>
                    <html:radio name="list" property="inRadix" indexed="true" value="10">dec</html:radio>
                    <html:radio name="list" property="inRadix" indexed="true" value="16">hex</html:radio>
                </fieldset>
                <fieldset>
                    <legend>output</legend>
                    <html:text name="list" property="output" size="30" indexed="true"/><br>
                    <html:radio name="list" property="outRadix" indexed="true" value="2">bin</html:radio>
                    <html:radio name="list" property="outRadix" indexed="true" value="8">oct</html:radio>
                    <html:radio name="list" property="outRadix" indexed="true" value="10">dec</html:radio>
                    <html:radio name="list" property="outRadix" indexed="true" value="16">hex</html:radio>
                </fieldset>
            </div>
            </logic:iterate>
        <p><html:submit value="convert" /></p>
        </html:form>
    </body>
</html:html>