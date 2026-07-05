package defpackage;

import androidx.compose.ui.node.Owner;

/* JADX INFO: loaded from: classes.dex */
public abstract class dv9 {
    public static final fz5 a = dch.h();

    public static final Owner a(av9 av9Var) {
        Owner owner = av9Var.S;
        if (owner != null) {
            return owner;
        }
        throw sq6.z("LayoutNode should be attached to an owner");
    }
}
