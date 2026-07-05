package defpackage;

import androidx.glance.appwidget.protobuf.f;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xv9 extends f {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    private static final xv9 DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_ALPHA_FIELD_NUMBER = 12;
    public static final int HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER = 11;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile ttc PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private n89 children_ = tud.H;
    private boolean hasAction_;
    private boolean hasImageAlpha_;
    private boolean hasImageColorFilter_;
    private boolean hasImageDescription_;
    private int height_;
    private int horizontalAlignment_;
    private int identity_;
    private int imageScale_;
    private int type_;
    private int verticalAlignment_;
    private int width_;

    static {
        xv9 xv9Var = new xv9();
        DEFAULT_INSTANCE = xv9Var;
        f.i(xv9.class, xv9Var);
    }

    public static void k(xv9 xv9Var, yv9 yv9Var) {
        xv9Var.getClass();
        if (yv9Var != yv9.UNRECOGNIZED) {
            xv9Var.type_ = yv9Var.E;
        } else {
            sz6.p("Can't get the number of an unknown enum value.");
        }
    }

    public static void l(xv9 xv9Var, qv9 qv9Var) {
        xv9Var.getClass();
        xv9Var.width_ = qv9Var.a();
    }

    public static void m(xv9 xv9Var, qv9 qv9Var) {
        xv9Var.getClass();
        xv9Var.height_ = qv9Var.a();
    }

    public static void n(xv9 xv9Var, rv9 rv9Var) {
        xv9Var.getClass();
        if (rv9Var != rv9.UNRECOGNIZED) {
            xv9Var.horizontalAlignment_ = rv9Var.E;
        } else {
            sz6.p("Can't get the number of an unknown enum value.");
        }
    }

    public static void o(xv9 xv9Var, zv9 zv9Var) {
        xv9Var.getClass();
        if (zv9Var != zv9.UNRECOGNIZED) {
            xv9Var.verticalAlignment_ = zv9Var.E;
        } else {
            sz6.p("Can't get the number of an unknown enum value.");
        }
    }

    public static void p(xv9 xv9Var, pv9 pv9Var) {
        xv9Var.getClass();
        if (pv9Var != pv9.UNRECOGNIZED) {
            xv9Var.imageScale_ = pv9Var.E;
        } else {
            sz6.p("Can't get the number of an unknown enum value.");
        }
    }

    public static void q(xv9 xv9Var) {
        xv9Var.getClass();
        xv9Var.identity_ = 1;
    }

    public static void r(xv9 xv9Var, boolean z) {
        xv9Var.hasAction_ = z;
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
    public static void s(xv9 xv9Var, ArrayList arrayList) {
        n89 n89Var = xv9Var.children_;
        if (!((o3) n89Var).E) {
            int size = n89Var.size();
            xv9Var.children_ = ((tud) n89Var).e(size == 0 ? 10 : size * 2);
        }
        List list = xv9Var.children_;
        Charset charset = r89.a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size2 = list.size();
        for (Object obj : arrayList) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size2) + " is null.";
                for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                    list.remove(size3);
                }
                mr9.h(str);
                return;
            }
            list.add(obj);
        }
    }

    public static void t(xv9 xv9Var, boolean z) {
        xv9Var.hasImageDescription_ = z;
    }

    public static void u(xv9 xv9Var, boolean z) {
        xv9Var.hasImageColorFilter_ = z;
    }

    public static void v(xv9 xv9Var, boolean z) {
        xv9Var.hasImageAlpha_ = z;
    }

    public static xv9 w() {
        return DEFAULT_INSTANCE;
    }

    public static wv9 x() {
        return (wv9) ((e28) DEFAULT_INSTANCE.b(5));
    }

    @Override // androidx.glance.appwidget.protobuf.f
    public final Object b(int i) {
        ttc k28Var;
        switch (sq6.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new c2e(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007\u000b\u0007\f\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", xv9.class, "identity_", "hasAction_", "hasImageDescription_", "hasImageColorFilter_", "hasImageAlpha_"});
            case 3:
                return new xv9();
            case 4:
                return new wv9(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ttc ttcVar = PARSER;
                if (ttcVar != null) {
                    return ttcVar;
                }
                synchronized (xv9.class) {
                    try {
                        k28Var = PARSER;
                        if (k28Var == null) {
                            k28Var = new k28();
                            PARSER = k28Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return k28Var;
            default:
                mr9.x();
                return null;
        }
    }
}
