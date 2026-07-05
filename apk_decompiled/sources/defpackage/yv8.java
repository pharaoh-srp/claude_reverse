package defpackage;

import com.anthropic.claude.api.chat.MessageImageAsset;

/* JADX INFO: loaded from: classes.dex */
public final class yv8 implements g89 {
    public final String a;

    public yv8(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.g89
    public final Object a(ns5 ns5Var, tp4 tp4Var) {
        if (!(ns5Var.f().d() instanceof MessageImageAsset)) {
            return ns5Var.i((vp4) tp4Var);
        }
        MessageImageAsset messageImageAsset = (MessageImageAsset) ns5Var.f().d();
        String strO = kgh.o(this.a, messageImageAsset.getUrl());
        Integer image_width = messageImageAsset.getImage_width();
        Integer image_height = messageImageAsset.getImage_height();
        ns5 ns5VarL = (image_width == null || image_height == null) ? ns5Var : ns5Var.l(nvj.a(image_width.intValue(), image_height.intValue()));
        fx8 fx8VarV = jx8.v(ns5Var.f());
        fx8VarV.b(strO);
        return ns5VarL.k(fx8VarV.a()).i((vp4) tp4Var);
    }
}
