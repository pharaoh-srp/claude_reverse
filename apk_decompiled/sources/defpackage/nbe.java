package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class nbe extends sbe implements cf9 {
    public final Constructor a;

    public nbe(Constructor constructor) {
        constructor.getClass();
        this.a = constructor;
    }

    @Override // defpackage.sbe
    public final Member c() {
        return this.a;
    }

    @Override // defpackage.cf9
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new ybe(typeVariable));
        }
        return arrayList;
    }

    public final Constructor j() {
        return this.a;
    }
}
