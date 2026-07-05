package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g44 implements zpf {
    public final String a;
    public final String b;
    public final g1i c;
    public final List d;

    public g44(String str, String str2, g1i g1iVar, List list) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = g1iVar;
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
        return "collapsed_tool_calls";
    }
}
