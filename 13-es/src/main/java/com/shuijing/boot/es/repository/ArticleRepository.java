package com.shuijing.boot.es.repository;

import com.shuijing.boot.es.entity.es.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author xhy
 * @blog https://mp.csdn.net/mp_blog/manage/article
 * @date 2021-12-12
 */
public interface ArticleRepository extends ElasticsearchRepository<Article, Long> {

    Page<Article> findByTitleLike(String title, Pageable page);
}

