package com.example.DBZ_API.Service;
import com.example.DBZ_API.Model.Sale;
import com.example.DBZ_API.Repository.SalesRepository;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;

@Service
public class SMSService {

    @Value("${twilio.sid}")
    private String twilioSid;

    @Value("${twilio.key}")
    private String twilioKey;

    @Value("${twilio.phone.from}")
    private String twilioPhoneFrom;

    @Value("${twilio.phone.to}")
    private String twilioPhoneTo;
@Autowired
    private SalesRepository repository;
    public void sendSms(Long saleId) {
        Sale sale = repository.findById(saleId).get();
        String date = sale.getDate().getMonthValue() +"/"+ sale.getDate().getYear();
        String msg = "Vendedor : "+ sale.getSellerName() +
                " Foi destaque em " + date +
                "Com um total de R$ "+String.format("%.2f",sale.getAmount());

        Twilio.init(twilioSid, twilioKey);

        PhoneNumber to = new PhoneNumber(twilioPhoneTo);
        PhoneNumber from = new PhoneNumber(twilioPhoneFrom);

        Message message = Message.creator(to, from, msg).create();

        System.out.println(message.getSid());
    }

}
