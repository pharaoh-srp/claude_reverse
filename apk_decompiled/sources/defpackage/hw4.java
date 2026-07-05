package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class hw4 extends LinkedHashMap {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw4(hi6 hi6Var, int i) {
        super(i, 1.0f, true);
        this.F = hi6Var;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ boolean containsKey(Object obj) {
        switch (this.E) {
            case 0:
                if (obj instanceof String) {
                    return super.containsKey((String) obj);
                }
                return false;
            default:
                return super.containsKey(obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ boolean containsValue(Object obj) {
        switch (this.E) {
            case 0:
                if (obj instanceof iw4) {
                    return super.containsValue((iw4) obj);
                }
                return false;
            default:
                return super.containsValue(obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ Object get(Object obj) {
        switch (this.E) {
            case 0:
                if (obj instanceof String) {
                    return (iw4) super.get((String) obj);
                }
                return null;
            default:
                return super.get(obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        switch (this.E) {
            case 0:
                return !(obj instanceof String) ? obj2 : (iw4) super.getOrDefault((String) obj, (iw4) obj2);
            default:
                return super.getOrDefault(obj, obj2);
        }
    }

    @Override // java.util.HashMap, java.util.Map
    public /* bridge */ boolean remove(Object obj, Object obj2) {
        switch (this.E) {
            case 0:
                if ((obj instanceof String) && (obj2 instanceof iw4)) {
                    return super.remove((String) obj, (iw4) obj2);
                }
                return false;
            default:
                return super.remove(obj, obj2);
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.E) {
            case 0:
                entry.getClass();
                int size = super.size();
                hi6 hi6Var = (hi6) this.F;
                if (size > 8 && !((HashSet) hi6Var.F).contains(entry.getKey())) {
                    sfa sfaVar = sfa.DEBUG;
                    zfa.a.getClass();
                    if (yfa.b()) {
                        CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : copyOnWriteArrayList) {
                            ((n30) ((zfa) obj)).getClass();
                            arrayList.add(obj);
                        }
                        if (!arrayList.isEmpty()) {
                            zfa.a.getClass();
                            String str = "Recycling WebView for " + entry.getKey() + " (cache at " + super.size() + "/8)";
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((n30) ((zfa) it.next())).b(sfaVar, "Conway", str);
                            }
                        }
                    }
                    hi6 hi6Var2 = (hi6) this.F;
                    iw4 iw4Var = (iw4) entry.getValue();
                    ViewParent parent = iw4Var.a.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(iw4Var.a);
                    }
                    iw4Var.a.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
                    int size2 = ((qo0) hi6Var2.H).size();
                    HashMap map = (HashMap) hi6Var2.I;
                    WebView webView = iw4Var.a;
                    if (size2 >= 8) {
                        map.remove(webView);
                        ((HashMap) hi6Var2.J).remove(iw4Var.a);
                        iw4Var.a.destroy();
                    } else {
                        gm8 gm8Var = (gm8) sta.f0(webView, map);
                        w6a w6aVar = (w6a) sta.f0(iw4Var.a, (HashMap) hi6Var2.J);
                        gm8Var.a = null;
                        w6aVar.a = null;
                        ((qo0) hi6Var2.H).addLast(new m9d(iw4Var.a, gm8Var, w6aVar));
                    }
                }
                break;
            default:
                if (size() > ((at) this.F).F) {
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw4(at atVar, int i) {
        super(i, 0.75f, true);
        this.F = atVar;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ Object remove(Object obj) {
        switch (this.E) {
            case 0:
                if (obj instanceof String) {
                    return (iw4) super.remove((String) obj);
                }
                return null;
            default:
                return super.remove(obj);
        }
    }
}
