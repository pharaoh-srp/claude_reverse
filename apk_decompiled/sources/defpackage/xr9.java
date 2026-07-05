package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public enum xr9 {
    CLASS(true),
    ANNOTATION_CLASS(true),
    TYPE_PARAMETER(false),
    PROPERTY(true),
    FIELD(true),
    LOCAL_VARIABLE(true),
    VALUE_PARAMETER(true),
    CONSTRUCTOR(true),
    FUNCTION(true),
    PROPERTY_GETTER(true),
    PROPERTY_SETTER(true),
    TYPE(false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPRESSION(false),
    FILE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TYPEALIAS(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    /* JADX INFO: Fake field, exist only in values array */
    STAR_PROJECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    CLASS_ONLY(false),
    OBJECT(false),
    STANDALONE_OBJECT(false),
    COMPANION_OBJECT(false),
    INTERFACE(false),
    ENUM_CLASS(false),
    ENUM_ENTRY(false),
    LOCAL_CLASS(false),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    BACKING_FIELD(true),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZER(false),
    /* JADX INFO: Fake field, exist only in values array */
    DESTRUCTURING_DECLARATION(false),
    /* JADX INFO: Fake field, exist only in values array */
    LAMBDA_EXPRESSION(false),
    /* JADX INFO: Fake field, exist only in values array */
    ANONYMOUS_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT_LITERAL(false);

    public static final HashMap F = new HashMap();
    public final boolean E;

    static {
        for (xr9 xr9Var : values()) {
            F.put(xr9Var.name(), xr9Var);
        }
        xr9[] xr9VarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (xr9 xr9Var2 : xr9VarArrValues) {
            if (xr9Var2.E) {
                arrayList.add(xr9Var2);
            }
        }
        w44.t1(arrayList);
        mp0.Z0(values());
        xr9 xr9Var3 = ANNOTATION_CLASS;
        xr9 xr9Var4 = CLASS;
        x44.X(xr9Var3, xr9Var4);
        x44.X(LOCAL_CLASS, xr9Var4);
        x44.X(CLASS_ONLY, xr9Var4);
        xr9 xr9Var5 = COMPANION_OBJECT;
        xr9 xr9Var6 = OBJECT;
        x44.X(xr9Var5, xr9Var6, xr9Var4);
        x44.X(STANDALONE_OBJECT, xr9Var6, xr9Var4);
        x44.X(INTERFACE, xr9Var4);
        x44.X(ENUM_CLASS, xr9Var4);
        xr9 xr9Var7 = ENUM_ENTRY;
        xr9 xr9Var8 = PROPERTY;
        xr9 xr9Var9 = FIELD;
        x44.X(xr9Var7, xr9Var8, xr9Var9);
        xr9 xr9Var10 = PROPERTY_SETTER;
        x44.W(xr9Var10);
        xr9 xr9Var11 = PROPERTY_GETTER;
        x44.W(xr9Var11);
        x44.W(FUNCTION);
        xr9 xr9Var12 = FILE;
        x44.W(xr9Var12);
        sc0 sc0Var = sc0.CONSTRUCTOR_PARAMETER;
        xr9 xr9Var13 = VALUE_PARAMETER;
        sta.h0(new cpc(sc0Var, xr9Var13), new cpc(sc0.FIELD, xr9Var9), new cpc(sc0.PROPERTY, xr9Var8), new cpc(sc0.FILE, xr9Var12), new cpc(sc0.PROPERTY_GETTER, xr9Var11), new cpc(sc0.PROPERTY_SETTER, xr9Var10), new cpc(sc0.RECEIVER, xr9Var13), new cpc(sc0.SETTER_PARAMETER, xr9Var13), new cpc(sc0.PROPERTY_DELEGATE_FIELD, xr9Var9));
    }

    xr9(boolean z) {
        this.E = z;
    }
}
