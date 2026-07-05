package defpackage;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.anthropic.claude.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class lvi {
    public static final ArrayList d = new ArrayList();
    public WeakHashMap a;
    public SparseArray b;
    public WeakReference c;

    public static lvi a(View view) {
        lvi lviVar = (lvi) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (lviVar != null) {
            return lviVar;
        }
        lvi lviVar2 = new lvi();
        lviVar2.a = null;
        lviVar2.b = null;
        lviVar2.c = null;
        view.setTag(R.id.tag_unhandled_key_event_manager, lviVar2);
        return lviVar2;
    }

    public final boolean b(View view, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = this.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    try {
                        if (this.a == null) {
                            this.a = new WeakHashMap();
                        }
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ArrayList arrayList2 = d;
                            View view2 = (View) ((WeakReference) arrayList2.get(size)).get();
                            if (view2 == null) {
                                arrayList2.remove(size);
                            } else {
                                this.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    this.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewC = c(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                if (this.b == null) {
                    this.b = new SparseArray();
                }
                this.b.put(keyCode, new WeakReference(viewC));
            }
        }
        return viewC != null;
    }

    public final View c(View view) {
        int size;
        WeakHashMap weakHashMap = this.a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewC = c(viewGroup.getChildAt(childCount));
                    if (viewC != null) {
                        return viewC;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                mr9.o();
            }
        }
        return null;
    }
}
