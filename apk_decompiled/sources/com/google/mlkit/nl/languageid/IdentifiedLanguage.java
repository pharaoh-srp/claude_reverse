package com.google.mlkit.nl.languageid;

import defpackage.iyj;
import defpackage.mqk;
import defpackage.uvj;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class IdentifiedLanguage {
    public final String a;
    public final float b;

    public IdentifiedLanguage(String str, float f) {
        this.a = str;
        this.b = f;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentifiedLanguage)) {
            return false;
        }
        IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) obj;
        return Float.compare(identifiedLanguage.b, this.b) == 0 && mqk.m(this.a, identifiedLanguage.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }

    public final String toString() {
        uvj uvjVar = new uvj("IdentifiedLanguage", 3);
        uvj uvjVar2 = new uvj(2);
        ((uvj) uvjVar.H).H = uvjVar2;
        uvjVar.H = uvjVar2;
        uvjVar2.G = this.a;
        uvjVar2.F = "languageTag";
        String strValueOf = String.valueOf(this.b);
        iyj iyjVar = new iyj(2);
        ((uvj) uvjVar.H).H = iyjVar;
        uvjVar.H = iyjVar;
        iyjVar.G = strValueOf;
        iyjVar.F = "confidence";
        return uvjVar.toString();
    }
}
