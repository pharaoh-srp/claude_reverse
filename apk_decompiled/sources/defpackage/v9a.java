package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.anthropic.claude.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class v9a extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ w9a b;

    public v9a(w9a w9aVar) {
        this.b = w9aVar;
        a();
    }

    public final void a() {
        vcb vcbVar = this.b.G;
        adb adbVar = vcbVar.v;
        if (adbVar != null) {
            vcbVar.i();
            ArrayList arrayList = vcbVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((adb) arrayList.get(i)) == adbVar) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final adb getItem(int i) {
        w9a w9aVar = this.b;
        vcb vcbVar = w9aVar.G;
        vcbVar.i();
        ArrayList arrayList = vcbVar.j;
        w9aVar.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (adb) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        w9a w9aVar = this.b;
        vcb vcbVar = w9aVar.G;
        vcbVar.i();
        int size = vcbVar.j.size();
        w9aVar.getClass();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.F.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((xdb) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
