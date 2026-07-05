package com.google.mlkit.common;

import defpackage.dgj;

/* JADX INFO: loaded from: classes3.dex */
public class MlKitException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(String str) {
        super(str);
        dgj.t(str, "Provided message must not be empty.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(String str, Exception exc) {
        super(str, exc);
        dgj.t(str, "Provided message must not be empty.");
    }
}
