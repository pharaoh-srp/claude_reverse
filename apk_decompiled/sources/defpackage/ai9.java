package defpackage;

import java.io.IOException;
import okio.Buffer;
import okio.ByteString;
import okio.Options;

/* JADX INFO: loaded from: classes3.dex */
public final class ai9 {
    public final String[] a;
    public final Options b;

    public ai9(String[] strArr, Options options) {
        this.a = strArr;
        this.b = options;
    }

    public static ai9 a(String... strArr) {
        try {
            ByteString[] byteStringArr = new ByteString[strArr.length];
            Buffer buffer = new Buffer();
            for (int i = 0; i < strArr.length; i++) {
                cj9.Q0(buffer, strArr[i]);
                buffer.readByte();
                byteStringArr[i] = buffer.t(buffer.F);
            }
            return new ai9((String[]) strArr.clone(), Options.Companion.b(byteStringArr));
        } catch (IOException e) {
            sz6.h(e);
            return null;
        }
    }
}
