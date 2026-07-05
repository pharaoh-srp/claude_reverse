package defpackage;

import android.text.TextUtils;
import androidx.appcompat.widget.ActionBarContextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements iyi {
    public int a;
    public boolean b;
    public Object c;

    public t(MessageDigest messageDigest, int i) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.c = messageDigest;
        this.a = i;
    }

    @Override // defpackage.iyi
    public void a() {
        this.b = true;
    }

    @Override // defpackage.iyi
    public void b() {
        super/*android.view.View*/.setVisibility(0);
        this.b = false;
    }

    @Override // defpackage.iyi
    public void c() {
        if (this.b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.J = null;
        super/*android.view.View*/.setVisibility(this.a);
    }

    public ep1 d() {
        boolean z = true;
        if (TextUtils.isEmpty((String) this.c) && TextUtils.isEmpty(null)) {
            z = false;
        }
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (z && !zIsEmpty) {
            sz6.p("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
            return null;
        }
        if (!this.b && !z && zIsEmpty) {
            sz6.p("Old SKU purchase information(token/id) or original external transaction id must be provided.");
            return null;
        }
        ep1 ep1Var = new ep1();
        ep1Var.b = (String) this.c;
        ep1Var.c = this.a;
        return ep1Var;
    }

    public boolean e() {
        return this.b;
    }

    public int f() {
        return this.a;
    }

    public j7g g() {
        return (j7g) this.c;
    }

    public void h(String str) {
        this.c = str;
    }

    public void i(int i) {
        this.a = i;
    }

    public t(j7g j7gVar, int i, boolean z) {
        this.c = j7gVar;
        this.a = i;
        this.b = z;
    }
}
