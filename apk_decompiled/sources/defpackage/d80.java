package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class d80 implements k80 {
    public final /* synthetic */ int E;
    public ArrayList F;

    public d80(int i) {
        this.E = i;
        switch (i) {
            case 2:
                this.F = null;
                break;
            case 3:
                this.F = new ArrayList();
                break;
            case 4:
            default:
                this.F = new ArrayList();
                break;
            case 5:
                this.F = new ArrayList();
                break;
        }
    }

    @Override // defpackage.k80
    public ke1 a() {
        ArrayList arrayList = this.F;
        return ((rp9) arrayList.get(0)).c() ? new x98(arrayList, 1) : new tuc(arrayList);
    }

    @Override // defpackage.k80
    public List b() {
        return this.F;
    }

    @Override // defpackage.k80
    public boolean c() {
        ArrayList arrayList = this.F;
        return arrayList.size() == 1 && ((rp9) arrayList.get(0)).c();
    }

    public void d(u42 u42Var) {
        if (this.F == null) {
            this.F = new ArrayList();
        }
        int i = 0;
        while (true) {
            int size = this.F.size();
            ArrayList arrayList = this.F;
            if (i >= size) {
                arrayList.add(u42Var);
                return;
            } else {
                if (((u42) arrayList.get(i)).a.b > u42Var.a.b) {
                    this.F.add(i, u42Var);
                    return;
                }
                i++;
            }
        }
    }

    public void e(d80 d80Var) {
        if (d80Var.F == null) {
            return;
        }
        if (this.F == null) {
            this.F = new ArrayList(d80Var.F.size());
        }
        Iterator it = d80Var.F.iterator();
        while (it.hasNext()) {
            d((u42) it.next());
        }
    }

    public void f(Path path) {
        ArrayList arrayList = this.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p7i p7iVar = (p7i) arrayList.get(size);
            Matrix matrix = zpi.a;
            if (p7iVar != null && !p7iVar.a) {
                zpi.a(path, p7iVar.d.i() / 100.0f, p7iVar.e.i() / 100.0f, p7iVar.f.i() / 360.0f);
            }
        }
    }

    public String g() {
        ArrayList arrayList = this.F;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            if (i != 0) {
                sb.append('\n');
            }
            sb.append(((xeg) arrayList.get(i)).a);
        }
        return sb.toString();
    }

    public ArrayList h() {
        return this.F;
    }

    public ArrayList i() {
        return this.F;
    }

    public ArrayList j() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            cfg cfgVar = ((xeg) it.next()).b;
            if (cfgVar != null) {
                arrayList.add(cfgVar);
            }
        }
        return arrayList;
    }

    public boolean k() {
        return this.F.isEmpty();
    }

    public String toString() {
        switch (this.E) {
            case 2:
                if (this.F == null) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = this.F.iterator();
                while (it.hasNext()) {
                    sb.append(((u42) it.next()).toString());
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public d80(ArrayList arrayList) {
        this.E = 0;
        this.F = arrayList;
    }

    public d80(JSONArray jSONArray) {
        this.E = 4;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new did(jSONObjectOptJSONObject));
                }
            }
        }
        this.F = arrayList;
    }
}
