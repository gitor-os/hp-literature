package com.hpwenxue.service.impl;import com.hpwenxue.domain.Articles;import com.hpwenxue.service.ArticlesService;import org.junit.Before;import org.junit.Test;import org.junit.runner.RunWith;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.test.context.SpringBootTest;import org.springframework.test.context.junit4.SpringRunner;import java.util.Date;import static org.junit.Assert.*;/** * @author : liuwenlong * @date : 2017/11/30 18:30 */@SpringBootTest@RunWith(SpringRunner.class)public class ArticleServiceImplTest {    @Autowired    private ArticlesService articlesService;    @Test    public void getAll() throws Exception {        System.out.println(articlesService.getAll());    }    @Test    public void getOne() throws Exception {    }    @Test    public void gatArticlesByName() throws Exception {    }    @Test    public void deleteById() throws Exception {    }    @Test    public void deleteByIds() throws Exception {    }    @Test    public void save() throws Exception{        Articles articles = new Articles();        articles.setContent("fsudfsdfsf");        articles.setCreateTime(new Date());        articles.setPageview(12);        articles.setTypeId(2);        articlesService.save(articles);    }}