package com.anthropic.claude.tool.model;

import defpackage.afe;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.pje;
import defpackage.qje;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/anthropic/claude/tool/model/RequestFormInputFromUserInputFieldsItemType;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "pje", "TEXT", "EMAIL", "PHONE", "NUMBER", "DATE", "PASSWORD", "SENSITIVE_TEXT", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = qje.class)
public final class RequestFormInputFromUserInputFieldsItemType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ RequestFormInputFromUserInputFieldsItemType[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final pje Companion;
    private final String loggingName;
    public static final RequestFormInputFromUserInputFieldsItemType TEXT = new RequestFormInputFromUserInputFieldsItemType("TEXT", 0, "text");
    public static final RequestFormInputFromUserInputFieldsItemType EMAIL = new RequestFormInputFromUserInputFieldsItemType("EMAIL", 1, "email");
    public static final RequestFormInputFromUserInputFieldsItemType PHONE = new RequestFormInputFromUserInputFieldsItemType("PHONE", 2, "phone");
    public static final RequestFormInputFromUserInputFieldsItemType NUMBER = new RequestFormInputFromUserInputFieldsItemType("NUMBER", 3, "number");
    public static final RequestFormInputFromUserInputFieldsItemType DATE = new RequestFormInputFromUserInputFieldsItemType("DATE", 4, "date");
    public static final RequestFormInputFromUserInputFieldsItemType PASSWORD = new RequestFormInputFromUserInputFieldsItemType("PASSWORD", 5, "password");
    public static final RequestFormInputFromUserInputFieldsItemType SENSITIVE_TEXT = new RequestFormInputFromUserInputFieldsItemType("SENSITIVE_TEXT", 6, "sensitive_text");

    private static final /* synthetic */ RequestFormInputFromUserInputFieldsItemType[] $values() {
        return new RequestFormInputFromUserInputFieldsItemType[]{TEXT, EMAIL, PHONE, NUMBER, DATE, PASSWORD, SENSITIVE_TEXT};
    }

    static {
        RequestFormInputFromUserInputFieldsItemType[] requestFormInputFromUserInputFieldsItemTypeArr$values = $values();
        $VALUES = requestFormInputFromUserInputFieldsItemTypeArr$values;
        $ENTRIES = wd6.n0(requestFormInputFromUserInputFieldsItemTypeArr$values);
        Companion = new pje();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new afe(3));
    }

    private RequestFormInputFromUserInputFieldsItemType(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.RequestFormInputFromUserInputFieldsItemType", values(), new String[]{"text", "email", "phone", "number", "date", "password", "sensitive_text"}, new Annotation[][]{null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static RequestFormInputFromUserInputFieldsItemType valueOf(String str) {
        return (RequestFormInputFromUserInputFieldsItemType) Enum.valueOf(RequestFormInputFromUserInputFieldsItemType.class, str);
    }

    public static RequestFormInputFromUserInputFieldsItemType[] values() {
        return (RequestFormInputFromUserInputFieldsItemType[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
