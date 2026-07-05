package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class cbc extends hmj implements lu8 {
    public final Object j;

    public cbc(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 1);
        this.j = obj;
    }

    public static lu8 F(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof lu8 ? (lu8) iInterfaceQueryLocalInterface : new muj(iBinder);
    }

    public static Object G(lu8 lu8Var) {
        if (lu8Var instanceof cbc) {
            return ((cbc) lu8Var).j;
        }
        IBinder iBinderAsBinder = lu8Var.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            sz6.p(ij0.g(length, "Unexpected number of IObjectWrapper declared fields: ", new StringBuilder(String.valueOf(length).length() + 53)));
            return null;
        }
        dgj.v(field);
        if (field.isAccessible()) {
            sz6.p("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
