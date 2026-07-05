package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c44 implements zpf {
    public final String a;
    public final String b;
    public final kh2 c;
    public final List d;

    public c44(String str, String str2, kh2 kh2Var, List list) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = kh2Var;
        this.d = list;
    }

    @Override // defpackage.zpf
    public final String a() {
        return this.b;
    }

    @Override // defpackage.zpf
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.zpf
    public final String getType() {
        return "collapsed_channel_events";
    }
}
