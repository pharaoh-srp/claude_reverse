package com.google.firebase.installations;

import com.google.firebase.FirebaseException;
import defpackage.dgj;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallationsException extends FirebaseException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseInstallationsException(String str) {
        super(str);
        dgj.t(str, "Detail message must not be empty");
    }
}
