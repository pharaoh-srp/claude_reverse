package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bp3 {
    public static final /* synthetic */ int e = 0;
    public final fqh a;
    public final List b;
    public final q78 c;
    public final String d;

    static {
        Collections.unmodifiableList(new ArrayList());
    }

    public bp3(fqh fqhVar, List list, q78 q78Var, String str) {
        this.a = fqhVar;
        this.b = list;
        this.c = q78Var;
        this.d = str;
    }

    public final byte[] a() {
        lrb lrbVar = fud.a;
        lrbVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            lrbVar.t(this, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
