package defpackage;

import com.google.gson.stream.JsonToken;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class j9i {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[JsonToken.values().length];
        a = iArr;
        try {
            iArr[JsonToken.NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[JsonToken.STRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[JsonToken.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[JsonToken.BEGIN_ARRAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[JsonToken.BEGIN_OBJECT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[JsonToken.NULL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
