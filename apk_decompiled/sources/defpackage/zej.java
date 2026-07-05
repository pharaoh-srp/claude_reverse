package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'H' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public class zej {
    public static final zej G;
    public static final zej H;
    public static final jej I;
    public static final nej J;
    public static final rej K;
    public static final /* synthetic */ zej[] L;
    public final dfj E;
    public final int F;

    /* JADX INFO: Fake field, exist only in values array */
    zej EF1;

    static {
        zej zejVar = new zej("DOUBLE", 0, dfj.H, 1);
        G = zejVar;
        zej zejVar2 = new zej("FLOAT", 1, dfj.G, 5);
        dfj dfjVar = dfj.F;
        zej zejVar3 = new zej("INT64", 2, dfjVar, 0);
        H = zejVar3;
        zej zejVar4 = new zej("UINT64", 3, dfjVar, 0);
        dfj dfjVar2 = dfj.E;
        zej zejVar5 = new zej("INT32", 4, dfjVar2, 0);
        zej zejVar6 = new zej("FIXED64", 5, dfjVar, 1);
        zej zejVar7 = new zej("FIXED32", 6, dfjVar2, 5);
        zej zejVar8 = new zej("BOOL", 7, dfj.I, 0);
        jej jejVar = new jej("STRING", 8, dfj.J, 2);
        I = jejVar;
        dfj dfjVar3 = dfj.M;
        nej nejVar = new nej("GROUP", 9, dfjVar3, 3);
        J = nejVar;
        rej rejVar = new rej("MESSAGE", 10, dfjVar3, 2);
        K = rejVar;
        L = new zej[]{zejVar, zejVar2, zejVar3, zejVar4, zejVar5, zejVar6, zejVar7, zejVar8, jejVar, nejVar, rejVar, new vej("BYTES", 11, dfj.K, 2), new zej("UINT32", 12, dfjVar2, 0), new zej("ENUM", 13, dfj.L, 0), new zej("SFIXED32", 14, dfjVar2, 5), new zej("SFIXED64", 15, dfjVar, 1), new zej("SINT32", 16, dfjVar2, 0), new zej("SINT64", 17, dfjVar, 0)};
    }

    public zej(String str, int i, dfj dfjVar, int i2) {
        this.E = dfjVar;
        this.F = i2;
    }

    public static zej valueOf(String str) {
        return (zej) Enum.valueOf(zej.class, str);
    }

    public static zej[] values() {
        return (zej[]) L.clone();
    }
}
