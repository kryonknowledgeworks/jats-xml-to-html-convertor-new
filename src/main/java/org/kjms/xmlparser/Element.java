package org.kjms.xmlparser;

import java.util.Set;

public final class Element {
    private Element() {}

    public static final String ARTICLE = "article";
    public static final String APPENDIX = "app";
    public static final String APPENDIX_GROUP = "app-group";
    public static final String FRONT = "front";
    public static final String FRONT_STUB = "front-stub";
    public static final String BACK = "back";
    public static final String BODY = "body";
    public static final String ARTICLE_META = "article-meta";
    public static final String ARTICLE_VERSION = "article-version";
    public static final String ARTICLE_VERSION_ALTERNATIVES = "article-version-alternatives";
    public static final String ARTICLE_CATEGORIES = "article-categories";
    public static final String ARTICLE_ID = "article-id";
    public static final String SUBJECT_GROUP = "subj-group";
    public static final String SUBTITLE = "subtitle";
    public static final String SUB_ARTICLE = "sub-article";
    public static final String SUBJECT = "subject";
    public static final String TITLE_GROUP = "title-group";
    public static final String ARTICLE_TITLE = "article-title";
    public static final String CONTRIBUTOR_GROUP = "contrib-group";
    public static final String CONTRIBUTOR = "contrib";
    public static final String CONTRIBUTOR_ID = "contrib-id";
    public static final String DEGREES = "degrees";
    public static final String DISPLAY_FORMULA = "disp-formula";
    public static final String DISPLAY_FORMULA_GROUP = "disp-formula-group";
    public static final String NAME = "name";
    public static final String AFFILIATION = "aff";
    public static final String AFFILIATION_ALTERNATIVES = "aff-alternatives";
    public static final String ET_AL = "etal";
    public static final String ROLE = "role";
    public static final String LABEL = "label";
    public static final String NAMED_CONTENT = "named-content";
    public static final String STYLED_CONTENT = "styled-content";

    public static final String TEXT = "#text";
    public static final String AUTHOR_NOTES = "author-notes";
    public static final String NOTE = "note";
    public static final String NOTES = "notes";
    public static final String NESTED_KEYWORD = "nested-kwd";
    public static final String AUTHOR_COMMENT = "author-comment";
    public static final String BIOGRAPHY = "bio";
    public static final String ON_BEHALF_OF = "on-behalf-of";
    public static final String CORRESPONDENCE = "corresp";
    public static final String SPEECH = "speech";
    public static final String SEE = "see";
    public static final String SEE_ALSO = "see-also";
    public static final String SANS_SERIF = "sans-serif";
    public static final String SELF_URI = "self-uri";
    public static final String SPEAKER = "speaker";
    public static final String STATEMENT = "statement";
    public static final String VERSION = "version";
    public static final String VERSE_GROUP = "verse-group";
    public static final String VERSE_LINE = "verse-line";
    public static final String ALTERNATE_TEXT = "alt-text";
    public static final String TEXTUAL_FORM = "textual-form";
    public static final String ALTERNATE_TITLE = "alt-title";
    public static final String INLINE_SUPPLEMENTARY_MATERIAL = "inline-supplementary-material";
    public static final String LONG_DESCRIPTION = "long-desc";
    public static final String EMAIL = "email";
    public static final String SECTION = "sec";
    public static final String SECTION_META = "sec-meta";
    public static final String SEASON = "season";
    public static final String ERA = "era";
    public static final String TITLE = "title";
    public static final String PARAGRAPH = "p";
    public static final String ACK = "ack";
    public static final String REFERENCE_LIST = "ref-list";
    public static final String REFERENCE = "ref";
    public static final String CITATION_ALTERNATIVES = "citation-alternatives";
    public static final String ELEMENT_CITATION = "element-citation";
    public static final String MIXED_CITATION = "mixed-citation";
    public static final String NLM_CITATION = "nlm-citation";
    public static final Set<String> CITATION_ELEMENTS = Set.of(CITATION_ALTERNATIVES, ELEMENT_CITATION, MIXED_CITATION, NLM_CITATION);
    public static final String SURNAME = "surname";
    public static final String GIVEN_NAMES = "given-names";
    public static final String PREFIX = "prefix";
    public static final String SUFFIX = "suffix";
    public static final String PERSON_GROUP = "person-group";
    public static final String SOURCE = "source";
    public static final String YEAR = "year";
    public static final String VOLUME = "volume";
    public static final String VOLUME_ISSUE_GROUP = "volume-issue-group";
    public static final String ISSUE = "issue";
    public static final String FPAGE = "fpage";
    public static final String LPAGE = "lpage";
    public static final String COMMENT = "comment";
    public static final String EXT_LINK = "ext-link";
    public static final String PUBLICATION_DATE = "pub-date";
    public static final String PUBLICATION_DATE_NOT_AVAILABLE = "pub-date-not-available";
    public static final String HISTORY = "history";
    public static final String PERMISSIONS = "permissions";
    public static final String ABSTRACT = "abstract";
    public static final String KEYWORD_GROUP = "kwd-group";
    public static final String KEYWORD = "kwd";
    public static final String DATE = "date";
    public static final String DATE_IN_CITATION = "date-in-citation";
    public static final String DAY = "day";
    public static final String MONTH = "month";
    public static final String COPYRIGHT_STATEMENT = "copyright-statement";
    public static final String COPYRIGHT_YEAR = "copyright-year";
    public static final String COPYRIGHT_HOLDER = "copyright-holder";
    public static final String LICENSE = "license";
    public static final String LICENSE_PARAGRAPH = "license-p";
    public static final String URI = "uri";
    public static final String BOLD = "bold";
    public static final String FIXED_CASE = "fixed-case";
    public static final String ITALIC = "italic";
    public static final String MONOSPACE = "monospace";
    public static final String OVERLINE = "overline";
    public static final String ROMAN = "roman";
    public static final String SMALL_CAPS = "sc";
    public static final String STRIKE = "strike";
    public static final String UNDERLINE = "underline";
    public static final String RUBY = "ruby";
    public static final String RUBY_BASE = "rb";
    public static final String RUBY_TEXTUAL_ANNOTATION = "rt";
    public static final String ANNOTATION = "annotation";
    public static final String ADDRESS = "address";
    public static final String ANSWER = "answer";
    public static final String ANSWER_SET = "answer-set";
    public static final String ARRAY = "array";
    public static final String ACCESS_DATE = "access-date";
    public static final String BLOCK_ALTERNATIVES = "block-alternatives";
    public static final String BOXED_TEXT = "boxed-text";
    public static final String CHEMICAL_STRUCTURE_WRAPPER = "chem-struct-wrap";
    public static final String CODE = "code";
    public static final String COUNTS = "counts";
    public static final String COUNT = "count";
    public static final String FIGURE_COUNT = "fig-count";
    public static final String TABLE_COUNT = "table-count";
    public static final String EQUATION_COUNT = "equation-count";
    public static final String REFERENCE_COUNT = "ref-count";
    public static final String PAGE_COUNT = "page-count";
    public static final String WORD_COUNT = "word-count";
    public static final String EXPLANATION = "explanation";
    public static final String FIGURE = "fig";
    public static final String FIGURE_GROUP = "fig-group";
    public static final String GRAPHIC = "graphic";
    public static final String MEDIA = "media";
    public static final String PREFORMAT = "preformat";
    public static final String QUESTION = "question";
    public static final String QUESTION_WRAPPER = "question-wrap";
    public static final String QUESTION_PREAMBLE = "question-preamble";
    public static final String QUESTION_WRAPPER_GROUP = "question-wrap-group";
    public static final String SUPPLEMENTARY_MATERIAL = "supplementary-material";
    public static final String TABLE_WRAPPER = "table-wrap";
    public static final String TABLE_WRAPPER_GROUP = "table-wrap-group";
    public static final String TABLE_WRAPPER_FOOT = "table-wrap-foot";
    public static final String TRANS_ABSTRACT = "trans-abstract";
    public static final String TRANS_SOURCE = "trans-source";
    public static final String TIME_STAMP = "time-stamp";
    public static final String TABLE_DATA = "td";
    public static final String TABLE_HEADER = "th";
    public static final String T_HEADER = "thead";
    public static final String T_BODY = "tbody";
    public static final String T_FOOT = "tfoot";
    public static final String TABLE_ROW = "tr";
    public static final String HORIZONTAL_RULE = "hr";
    public static final String ADDRESS_LINE = "addr-line";
    public static final String CITY = "city";
    public static final String COUNTRY = "country";
    public static final String FAX = "fax";
    public static final String INSTITUTION = "institution";
    public static final String INSTITUTION_ID = "institution-id";
    public static final String INSTITUTION_WRAPPER = "institution-wrap";
    public static final String PHONE = "phone";
    public static final String POSTAL_CODE = "postal-code";
    public static final String RESTRICTED_BY = "restricted-by";
    public static final String EXTENDED_BY = "extended-by";
    public static final String CUSTOM_META_GROUP = "custom-meta-group";
    public static final String CUSTOM_META = "custom-meta";
    public static final String META_NAME = "meta-name";
    public static final String META_VALUE = "meta-value";
    public static final String STATE = "state";
    public static final String OBJECT_ID = "object-id";
    public static final String JOURNAL_ID = "journal-id";
    public static final String JOURNAL_TITLE = "journal-title";
    public static final String JOURNAL_SUBTITLE = "journal-subtitle";
    public static final String JOURNAL_TITLE_GROUP = "journal-title-group";
    public static final String JOURNAL_META = "journal-meta";
    public static final String CAPTION = "caption";
    public static final String CONFERENCE = "conference";
    public static final String CONFERENCE_NUMBER = "conf-num";
    public static final String CONFERENCE_THEME = "conf-theme";
    public static final String COMPOUND_KEYWORD = "compound-kwd";
    public static final String COMPOUND_KEYWORD_PART = "compound-kwd-part";
    public static final String COMPOUND_SUBJECT = "compound-subject";
    public static final String DEFINITION = "def";
    public static final String DEFINITION_HEAD = "def-head";
    public static final String DEFINITION_ITEM = "def-item";
    public static final String COMPOUND_SUBJECT_PART = "compound-subject-part";
    public static final String TABLE = "table";
    public static final String ALTERNATIVES = "alternatives";
    public static final String SUPPORT_GROUP = "support-group";
    public static final String RESOURCE_GROUP = "resource-group";
    public static final String RESOURCE_ID = "resource-id";
    public static final String RESOURCE_NAME = "resource-name";
    public static final String RESPONSE = "response";
    public static final String RESOURCE_WRAPPER = "resource-wrap";
    public static final String SUPPORT_DESCRIPTION = "support-description";
    public static final String FUNDING_GROUP = "funding-group";
    public static final String FUNDING_SOURCE = "funding-source";
    public static final String CONTRIBUTED_RESOURCE_GROUP = "contributed-resource-group";
    public static final String ATTRIBUTION = "attrib";
    public static final String AWARD_ID = "award-id";
    public static final String AWARD_NAME = "award-name";
    public static final String AWARD_GROUP = "award-group";
    public static final String AWARD_DESCRIPTION = "award-desc";
    public static final String PROCESSING_META = "processing-meta";
    public static final String PRODUCT = "product";
    public static final String PRICE = "price";
    public static final String FLOATS_GROUP = "floats-group";
    public static final String PRINCIPAL_AWARD_RECIPIENT = "principal-award-recipient";
    public static final String PRINCIPAL_INVESTIGATOR = "principal-investigator";
    public static final String FUNDING_STATEMENT = "funding-statement";
    public static final String OPEN_ACCESS = "open-access";
    public static final String OPTION = "option";
    public static final String BREAK = "break";
    public static final String ALI_FREE_TO_READ = "ali:free_to_read";
    public static final String ALI_LICENSE_REFERENCE = "ali:license_ref";
    public static final String INLINE_GRAPHIC = "inline-graphic";
    public static final String INLINE_MEDIA_OBJECT = "inline-media";
    public static final String PRIVATE_CHARACTER = "private-char";
    public static final String CHEMICAL_STRUCTURE = "chem-struct";
    public static final String CHAPTER_TITLE = "chapter-title";
    public static final String CONFERENCE_ACRONYM = "conf-acronym";
    public static final String CONFERENCE_DATE = "conf-date";
    public static final String CONFERENCE_LOCATION = "conf-loc";
    public static final String CONFERENCE_NAME = "conf-name";
    public static final String CONFERENCE_SPONSOR = "conf-sponsor";
    public static final String DATA_TITLE = "data-title";
    public static final String EDITION = "edition";
    public static final String EVENT = "event";
    public static final String EVENT_DESCRIPTION = "event-desc";
    public static final String ELOCATION_ID = "elocation-id";
    public static final String GOVERNMENT = "gov";
    public static final String ISBN = "isbn";
    public static final String ISSN = "issn";
    public static final String PATENT = "patent";
    public static final String PART_TITLE = "part-title";
    public static final String ISSN_LINKING = "issn-l";
    public static final String PAGE_RANGE = "page-range";
    public static final String PUBLICATION_ID = "pub-id";
    public static final String PUBLICATION_HISTORY = "pub-history";
    public static final String PUBLISHER_LOCATION = "publisher-loc";
    public static final String PUBLISHER = "publisher";
    public static final String PUBLISHER_NAME = "publisher-name";
    public static final String SIZE = "size";
    public static final String SIGNATURE = "sig";
    public static final String SIGNATURE_BLOCK = "sig-block";
    public static final String STANDARD = "std";
    public static final String STANDARD_ORGANIZATION = "std-organization";
    public static final String STRING_NAME = "string-name";
    public static final String STRING_DATE = "string-date";
    public static final String SUPPLEMENT = "supplement";
    public static final String INLINE_FORMULA = "inline-formula";
    public static final String SUBSCRIPT = "sub";
    public static final String SUPERSCRIPT = "sup";
    public static final String TEX_MATH_EQUATION = "tex-math";
    public static final String MATH = "mml:math";
    public static final String ABBREVIATION = "abbrev";
    public static final String ABBREVIATION_JOURNAL_TITLE = "abbrev-journal-title";
    public static final String INDEX_TERM = "index-term";
    public static final String TERM = "term";
    public static final String TERM_HEAD = "term-head";
    public static final String INDEX_TERM_RANGE_END = "index-term-range-end";
    public static final String MILESTONE_END = "milestone-end";
    public static final String MILESTONE_START = "milestone-start";
    public static final String RELATED_ARTICLE = "related-article";
    public static final String RELATED_OBJECT = "related-object";
    public static final String DISPLAY_QUOTE = "disp-quote";
    public static final String FOOTNOTE = "fn";
    public static final String FOOTNOTE_GROUP = "fn-group";
    public static final String GLOSSARY = "glossary";
    public static final String GLYPH_DATA = "glyph-data";
    public static final String GLYPH_REFERENCE = "glyph-ref";
    public static final String TARGET = "target";
    public static final String CROSS_REFERENCE = "xref";
    public static final String ANONYMOUS = "anonymous";
    public static final String COLLABORATIVE = "collab";
    public static final String COLUMN = "col";
    public static final String COLUMN_GROUP = "colgroup";
    public static final String COLLABORATIVE_ALTERNATIVES = "collab-alternatives";
    public static final String NAME_ALTERNATIVES = "name-alternatives";
    public static final String LIST = "list";
    public static final String LIST_ITEM = "list-item";
    public static final String DEFINITION_LIST = "def-list";
    public static final String VOLUME_ID = "volume-id";
    public static final String VOLUME_SERIES = "volume-series";
    public static final String SERIES = "series";
    public static final String SERIES_TITLE = "series-title";
    public static final String SERIES_TEXT = "series-text";
    public static final String ISSUE_ID = "issue-id";
    public static final String ISSUE_TITLE = "issue-title";
    public static final String ISSUE_TITLE_GROUP = "issue-title-group";
    public static final String ISSUE_SPONSOR = "issue-sponsor";
    public static final String ISSUE_PART = "issue-part";
    public static final String ISSUE_SUBTITLE = "issue-subtitle";
    public static final String TRANSLATED_TITLE_GROUP = "trans-title-group";
    public static final String TRANS_TITLE = "trans-title";
    public static final String TRANS_SUBTITLE = "trans-subtitle";
    public static final Set<String> ACCESSIBILITY_ELEMENTS = Set.of(ALTERNATE_TEXT, LONG_DESCRIPTION);
    public static final Set<String> LIST_ELEMENTS = Set.of(LIST, DEFINITION_LIST);
    public static final Set<String> OWNERSHIP_ELEMENTS = Set.of(ATTRIBUTION, PERMISSIONS);
    public static final Set<String> CONTRIBUTOR_NAMING_ELEMENTS = Set.of(ANONYMOUS, COLLABORATIVE, COLLABORATIVE_ALTERNATIVES, NAME, NAME_ALTERNATIVES, STRING_NAME);
    public static final Set<String> INTERNAL_LINKING_ELEMENTS = Set.of(FOOTNOTE, TARGET, CROSS_REFERENCE);
    public static final Set<String> RELATED_MATERIAL_ELEMENTS = Set.of(INLINE_SUPPLEMENTARY_MATERIAL, RELATED_ARTICLE, RELATED_OBJECT);
    public static final Set<String> LINKING_ELEMENTS = Set.of(EMAIL, EXT_LINK, URI);
    public static final Set<String> OTHER_INLINE_ELEMENTS = Set.of(ABBREVIATION, INDEX_TERM, INDEX_TERM_RANGE_END, MILESTONE_END, MILESTONE_START, NAMED_CONTENT, STYLED_CONTENT);
    public static final Set<String> INLINE_DISPLAY_ELEMENTS = Set.of(INLINE_GRAPHIC, INLINE_MEDIA_OBJECT, PRIVATE_CHARACTER);
    public static final Set<String> INLINE_MATH_ELEMENTS = Set.of(CHEMICAL_STRUCTURE, INLINE_FORMULA);
    public static final Set<String> BASELINE_CHANGE_ELEMENTS = Set.of(SUBSCRIPT, SUPERSCRIPT);
    public static final Set<String> MATH_ELEMENTS = Set.of(TEX_MATH_EQUATION, MATH);
    public static final Set<String> ADDRESS_ELEMENTS = Set.of(ADDRESS_LINE, CITY, COUNTRY, INSTITUTION, INSTITUTION_WRAPPER, PHONE, POSTAL_CODE, STATE);
    public static final Set<String> PARAGRAPH_LEVEL_DISPLAY_ELEMENTS = Set.of(ADDRESS, ANSWER, ANSWER_SET, ARRAY, BLOCK_ALTERNATIVES, BOXED_TEXT, CHEMICAL_STRUCTURE_WRAPPER,
            CODE, EXPLANATION, FIGURE, FIGURE_GROUP, GRAPHIC, MEDIA, PREFORMAT, QUESTION, QUESTION_WRAPPER, QUESTION_WRAPPER_GROUP
            , SUPPLEMENTARY_MATERIAL, TABLE_WRAPPER, TABLE_WRAPPER_GROUP);

    public static final Set<String> EMPHASIS_ELEMENTS = Set.of(BOLD, FIXED_CASE, ITALIC, MONOSPACE, OVERLINE, ROMAN, SANS_SERIF, SMALL_CAPS, STRIKE, UNDERLINE, RUBY);
}
