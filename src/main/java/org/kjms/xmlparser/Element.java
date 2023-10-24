package org.kjms.xmlparser;

import java.util.List;
import java.util.Set;

public final class Element {
    private Element() {
    }

    public static final String FRONT = "front";
    public static final String BACK = "back";
    public static final String BODY = "body";
    public static final String ARTICLE_META = "article-meta";
    public static final String ARTICLE_CATEGORIES = "article-categories";
    public static final String ARTICLE_ID = "article-id";
    public static final String SUBJ_GROUP = "subj-group";
    public static final String SUBJECT = "subject";
    public static final String TITLE_GROUP = "title-group";
    public static final String ARTICLE_TITLE = "article-title";
    public static final String CONTRIB_GROUP = "contrib-group";
    public static final String CONTRIB = "contrib";
    public static final String NAME = "name";
    public static final String XREF = "xref";
    public static final String AFF = "aff";
    public static final String LABEL = "label";
    public static final String TEXT = "#text";
    public static final String AUTHOR_NOTES = "author-notes";
    public static final String CORRESP = "corresp";
    public static final String EMAIL = "email";
    public static final String SEC = "sec";
    public static final String TITLE = "title";
    public static final String PARAGRAPH = "p";
    public static final String ACK = "ack";
    public static final String REF_LIST = "ref-list";
    public static final String REF = "ref";
    public static final String CITATION_ALTERNATIVES = "citation-alternatives";
    public static final String ELEMENT_CITATION = "element-citation";
    public static final String MIXED_CITATION = "mixed-citation";
    public static final String NLM_CITATION = "nlm-citation";
    public static final Set<String> CITATION_ELEMENTS = Set.of(CITATION_ALTERNATIVES, ELEMENT_CITATION, MIXED_CITATION, NLM_CITATION);

    public static final String SURNAME = "surname";
    public static final String GIVEN_NAMES = "given-names";
    public static final String PERSON_GROUP = "person-group";
    public static final String SOURCE = "source";
    public static final String YEAR = "year";
    public static final String VOLUME = "volume";
    public static final String ISSUE = "issue";
    public static final String FPAGE = "fpage";
    public static final String LPAGE = "lpage";
    public static final String COMMENT = "comment";
    public static final String EXT_LINK = "ext-link";
    public static final String PUB_DATE = "pub-date";
    public static final String HISTORY = "history";
    public static final String PERMISSIONS = "permissions";
    public static final String ABSTRACT = "abstract";
    public static final String KWD_GROUP = "kwd-group";
    public static final String KWD = "kwd";
    public static final String DATE = "date";
    public static final String DAY = "day";
    public static final String MONTH = "month";
    public static final String COPYRIGHT_STATEMENT = "copyright-statement";
    public static final String COPYRIGHT_YEAR = "copyright-year";
    public static final String LICENSE = "license";
    public static final String LICENSE_P = "license-p";
    public static final Set<String> LINKING_ELEMENTS = Set.of(EMAIL);
    public static final String  SUPER_SCRIPTS = "sup";
}
