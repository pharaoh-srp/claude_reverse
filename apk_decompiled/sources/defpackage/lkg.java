package defpackage;

import com.squareup.moshi.JsonDataException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class lkg extends gg9 {
    public final Class a;
    public final String[] b;
    public final Enum[] c;
    public final ai9 d;

    public lkg(Class cls) {
        this.a = cls;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.c = enumArr;
            this.b = new String[enumArr.length];
            int i = 0;
            while (true) {
                Enum[] enumArr2 = this.c;
                if (i >= enumArr2.length) {
                    this.d = ai9.a(this.b);
                    return;
                }
                String strName = enumArr2[i].name();
                String[] strArr = this.b;
                Field field = cls.getField(strName);
                Set set = spi.a;
                strArr[i] = spi.h(strName, (cg9) field.getAnnotation(cg9.class));
                i++;
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e);
        }
    }

    @Override // defpackage.gg9
    public final Object fromJson(ci9 ci9Var) {
        int iP = ci9Var.P(this.d);
        if (iP != -1) {
            return this.c[iP];
        }
        String strC = ci9Var.c();
        String strNextString = ci9Var.nextString();
        StringBuilder sb = new StringBuilder("Expected one of ");
        ms6.x(" but was ", strNextString, " at path ", sb, Arrays.asList(this.b));
        sb.append(strC);
        throw new JsonDataException(sb.toString());
    }

    @Override // defpackage.gg9
    public final void toJson(jj9 jj9Var, Object obj) {
        jj9Var.r0(this.b[((Enum) obj).ordinal()]);
    }

    public final String toString() {
        return "JsonAdapter(" + this.a.getName() + ")";
    }
}
