package com.easy136.demo.sitemesh.tag;

import org.sitemesh.SiteMeshContext;
import org.sitemesh.content.ContentProperty;
import org.sitemesh.content.tagrules.TagRuleBundle;
import org.sitemesh.content.tagrules.html.ExportTagToContentRule;
import org.sitemesh.tagprocessor.State;

/**
 * Created by jiangqingen on 16/6/2.
 */
public class SampleTag implements TagRuleBundle {

        @Override
        public void install(State defaultState, ContentProperty contentProperty, SiteMeshContext siteMeshContext) {
            defaultState.addRule("otherUrl", new ExportTagToContentRule(siteMeshContext,contentProperty.getChild("otherUrl"),false));
            defaultState.addRule("modal", new ExportTagToContentRule(siteMeshContext,contentProperty.getChild("modal"),false));
        }

        @Override
        public void cleanUp(State defaultState, ContentProperty contentProperty,SiteMeshContext siteMeshContext) {

        }
}
