package com.lanou.gittub.util;
import com.aliyuncs.CommonRequest;
        import com.aliyuncs.CommonResponse;
        import com.aliyuncs.DefaultAcsClient;
        import com.aliyuncs.IAcsClient;
        import com.aliyuncs.exceptions.ClientException;
        import com.aliyuncs.exceptions.ServerException;
        import com.aliyuncs.http.MethodType;
        import com.aliyuncs.profile.DefaultProfile;
public class StaffRegister {
    private static String accessKeyId="LTAI4FkxtExiPXfb3owz8o69";
    private static String accessSecret="PQeI5581kunU7vxjhREJvLu6iXFi3K";
    public static String staffRegister(String telephone){
        DefaultProfile profile = DefaultProfile.getProfile("郑州", accessKeyId, accessSecret);
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "郑州");
        request.putQueryParameter("PhoneNumbers", telephone);
        //阿里大于短信服务签名管理的签名名称
        request.putQueryParameter("SignName", "帮忙问答");
        //模板管理的模板CODE
        request.putQueryParameter("TemplateCode", "SMS_175542452");
        //生成验证码
        String random = (int) ((Math.random() * 9 + 1) * 100000) + "";
        //模板内容中的变量${code}
        request.putQueryParameter("TemplateParam", "{\"code\":\""+random+"\"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return random;
    }

}