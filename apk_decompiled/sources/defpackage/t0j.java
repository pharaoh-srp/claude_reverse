package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class t0j implements dxg {
    public static final hd5 I;
    public final ssc E = new ssc();
    public final ssc F = new ssc();
    public final s0j G;
    public Inflater H;

    static {
        iz8 iz8Var = nz8.F;
        I = new hd5(-9223372036854775807L, -9223372036854775807L, vde.I);
    }

    public t0j(List list) {
        int i;
        s0j s0jVar = new s0j();
        this.G = s0jVar;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = tpi.a;
        for (String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(",", -1);
                s0jVar.f = new int[strArrSplit.length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int[] iArr = s0jVar.f;
                    try {
                        i = Integer.parseInt(strArrSplit[i2].trim(), 16);
                    } catch (RuntimeException e) {
                        ysj.v("VobsubParser", "Parsing color failed", e);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length != 2) {
                    ysj.u("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        s0jVar.g = Integer.parseInt(strArrSplit2[0]);
                        s0jVar.h = Integer.parseInt(strArrSplit2[1]);
                        s0jVar.d = true;
                    } catch (RuntimeException e2) {
                        ysj.v("VobsubParser", "Parsing IDX failed", e2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x00bb. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.dxg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(byte[] r26, int r27, int r28, defpackage.cxg r29, defpackage.gm4 r30) {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t0j.b(byte[], int, int, cxg, gm4):void");
    }
}
