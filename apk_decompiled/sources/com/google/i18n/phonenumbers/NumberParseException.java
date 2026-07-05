package com.google.i18n.phonenumbers;

import defpackage.y6a;

/* JADX INFO: loaded from: classes.dex */
public class NumberParseException extends Exception {
    public final int E;
    public final String F;

    public NumberParseException(int i, String str) {
        super(str);
        this.F = str;
        this.E = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "Error type: " + y6a.x(this.E) + ". " + this.F;
    }
}
