package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class a6g implements gbj {
    public static volatile a6g c;
    public static final ReentrantLock d = new ReentrantLock();
    public final cc7 a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public a6g(y5g y5gVar) {
        this.a = y5gVar;
        if (y5gVar != null) {
            y5gVar.d(new fnf(1, this));
        }
    }

    @Override // defpackage.gbj
    public final void a(dx7 dx7Var) {
        synchronized (d) {
            try {
                if (this.a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.b.iterator();
                it.getClass();
                while (it.hasNext()) {
                    z5g z5gVar = (z5g) it.next();
                    if (z5gVar.b == dx7Var) {
                        arrayList.add(z5gVar);
                    }
                }
                this.b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((z5g) it2.next()).a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((z5g) it3.next()).a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    cc7 cc7Var = this.a;
                    if (cc7Var != null) {
                        ((y5g) cc7Var).b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.gbj
    public final void b(Context context, ao0 ao0Var, dx7 dx7Var) {
        Object next;
        WindowManager.LayoutParams attributes;
        iBinder = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        lm6 lm6Var = lm6.E;
        if (activity == null) {
            dx7Var.accept(new odj(lm6Var));
            return;
        }
        ReentrantLock reentrantLock = d;
        reentrantLock.lock();
        try {
            cc7 cc7Var = this.a;
            if (cc7Var == null) {
                dx7Var.accept(new odj(lm6Var));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.b;
            boolean z = false;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((z5g) it.next()).a.equals(activity)) {
                        z = true;
                        break;
                    }
                }
            }
            z5g z5gVar = new z5g(activity, ao0Var, dx7Var);
            copyOnWriteArrayList.add(z5gVar);
            if (z) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (activity.equals(((z5g) next).a)) {
                            break;
                        }
                    }
                }
                z5g z5gVar2 = (z5g) next;
                odj odjVar = z5gVar2 != null ? z5gVar2.c : null;
                if (odjVar != null) {
                    z5gVar.c = odjVar;
                    z5gVar.b.accept(odjVar);
                }
            } else {
                y5g y5gVar = (y5g) cc7Var;
                Window window = activity.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                }
                if (iBinder != null) {
                    y5gVar.c(iBinder, activity);
                } else {
                    activity.getWindow().getDecorView().addOnAttachStateChangeListener(new q88(y5gVar, activity));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
