package org.jsoup;

import defpackage.ij0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class UnsupportedMimeTypeException extends IOException {
    @Override // java.lang.Throwable
    public final String toString() {
        return ij0.m(new StringBuilder(), super.toString(), ". Mimetype=null, URL=null");
    }
}
