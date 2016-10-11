package th.co.gosoft.go10.test;

import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.junit.Test;

import th.co.gosoft.go10.model.TopicModel;
import th.co.gosoft.go10.rest.TopicService;

public class TopicServiceTest {

    DateFormat postFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
    
    @Test
    public void formatDateTest() {
        TopicService topicService = new TopicService();
        List<TopicModel> topicModelList = createTestDataList();
        List<TopicModel> resultList = topicService.formatDate(topicModelList);
        assertEquals(2, resultList.size());
    }
    
    private List<TopicModel> createTestDataList() {
        List<TopicModel> resultList = new ArrayList<TopicModel>();
        resultList.add(new TopicModel("test1", postFormat.format(new Date()), null));
        resultList.add(new TopicModel("test2", postFormat.format(new Date()), null));
        return resultList;
    }
}
