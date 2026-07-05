package defpackage;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yrc extends m08 implements bz7 {
    public static final yrc E = new yrc(1, ybi.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        Type type = (Type) obj;
        type.getClass();
        return ybi.c(type);
    }
}
