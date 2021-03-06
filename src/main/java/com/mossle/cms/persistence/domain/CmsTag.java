package com.mossle.cms.persistence.domain;

// Generated by Hibernate Tools
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CmsTag .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "CMS_TAG")
public class CmsTag implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private String name;

    /** null. */
    private Integer countArticle;

    /** null. */
    private String tenantId;

    /** . */
    private Set<CmsTagArticle> cmsTagArticles = new HashSet<CmsTagArticle>(0);

    public CmsTag() {
    }

    public CmsTag(String name, Integer countArticle, String tenantId,
            Set<CmsTagArticle> cmsTagArticles) {
        this.name = name;
        this.countArticle = countArticle;
        this.tenantId = tenantId;
        this.cmsTagArticles = cmsTagArticles;
    }

    /** @return null. */
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @Column(name = "NAME", length = 50)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "COUNT_ARTICLE")
    public Integer getCountArticle() {
        return this.countArticle;
    }

    /**
     * @param countArticle
     *            null.
     */
    public void setCountArticle(Integer countArticle) {
        this.countArticle = countArticle;
    }

    /** @return null. */
    @Column(name = "TENANT_ID", length = 64)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            null.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cmsTag")
    public Set<CmsTagArticle> getCmsTagArticles() {
        return this.cmsTagArticles;
    }

    /**
     * @param cmsTagArticles
     *            .
     */
    public void setCmsTagArticles(Set<CmsTagArticle> cmsTagArticles) {
        this.cmsTagArticles = cmsTagArticles;
    }
}
