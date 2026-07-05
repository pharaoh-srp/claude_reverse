package com.google.re2j;

import defpackage.ij0;

/* JADX INFO: loaded from: classes3.dex */
public class PatternSyntaxException extends RuntimeException {
    public PatternSyntaxException(String str, String str2) {
        super(ij0.l("error parsing regexp: ", str, ": `", str2, "`"));
    }
}
