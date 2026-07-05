package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b6k extends zdk {
    private static final b6k zzb;
    private xek zzd = clk.e();

    static {
        b6k b6kVar = new b6k();
        zzb = b6kVar;
        zdk.f(b6k.class, b6kVar);
    }

    public static x5k p() {
        return (x5k) zzb.k();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void q(b6k b6kVar, ArrayList arrayList) {
        xek xekVar = b6kVar.zzd;
        if (!((l8k) xekVar).E) {
            int size = xekVar.size();
            b6kVar.zzd = xekVar.n(size + size);
        }
        List list = b6kVar.zzd;
        Charset charset = kfk.a;
        int size2 = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size2);
        } else if (list instanceof clk) {
            clk clkVar = (clk) list;
            int i = clkVar.G + size2;
            int length = clkVar.F.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    clkVar.F = Arrays.copyOf(clkVar.F, length);
                } else {
                    clkVar.F = new Object[Math.max(i, 10)];
                }
            }
        }
        int size3 = list.size();
        int size4 = arrayList.size();
        for (int i2 = 0; i2 < size4; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                String strU = grc.u("Element at index ", list.size() - size3, " is null.");
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        mr9.h(strU);
                        return;
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // defpackage.zdk
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new glk(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", s5k.class});
        }
        if (i2 == 3) {
            return new b6k();
        }
        if (i2 == 4) {
            return new x5k(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
