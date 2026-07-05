package com.anthropic.claude.tool.model;

import com.anthropic.claude.tool.model.Tool;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final /* synthetic */ f a = new f();

    public static Tool a(String str) {
        str.getClass();
        Tool.Analysis analysis = Tool.Analysis.INSTANCE;
        if (str.equals(analysis.getName())) {
            return analysis;
        }
        Tool.Artifacts artifacts = Tool.Artifacts.INSTANCE;
        if (str.equals(artifacts.getName())) {
            return artifacts;
        }
        Tool.Compass compass = Tool.Compass.INSTANCE;
        if (str.equals(compass.getName())) {
            return compass;
        }
        Tool.DriveSearch driveSearch = Tool.DriveSearch.INSTANCE;
        if (str.equals(driveSearch.getName())) {
            return driveSearch;
        }
        Tool.WebSearch webSearch = Tool.WebSearch.INSTANCE;
        return str.equals(webSearch.getName()) ? webSearch : new Tool.Unknown(str, "");
    }

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.tool.model.Tool", kceVar.b(Tool.class), new pl9[]{kceVar.b(Tool.Analysis.class), kceVar.b(Tool.Artifacts.class), kceVar.b(Tool.Compass.class), kceVar.b(Tool.DriveSearch.class), kceVar.b(Tool.Unknown.class), kceVar.b(Tool.WebSearch.class)}, new KSerializer[]{new lq6("com.anthropic.claude.tool.model.Tool.Analysis", Tool.Analysis.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.tool.model.Tool.Artifacts", Tool.Artifacts.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.tool.model.Tool.Compass", Tool.Compass.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.tool.model.Tool.DriveSearch", Tool.DriveSearch.INSTANCE, new Annotation[0]), g.a, new lq6("com.anthropic.claude.tool.model.Tool.WebSearch", Tool.WebSearch.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
