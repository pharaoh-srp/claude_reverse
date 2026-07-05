package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class scb extends BaseAdapter {
    public final vcb a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public scb(vcb vcbVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = vcbVar;
        this.f = i;
        a();
    }

    public final void a() {
        vcb vcbVar = this.a;
        adb adbVar = vcbVar.v;
        if (adbVar != null) {
            vcbVar.i();
            ArrayList arrayList = vcbVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((adb) arrayList.get(i)) == adbVar) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final adb getItem(int i) {
        ArrayList arrayListL;
        boolean z = this.d;
        vcb vcbVar = this.a;
        if (z) {
            vcbVar.i();
            arrayListL = vcbVar.j;
        } else {
            arrayListL = vcbVar.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (adb) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z = this.d;
        vcb vcbVar = this.a;
        if (z) {
            vcbVar.i();
            arrayListL = vcbVar.j;
        } else {
            arrayListL = vcbVar.l();
        }
        return this.b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        xdb xdbVar = (xdb) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        xdbVar.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
