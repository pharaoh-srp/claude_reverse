package defpackage;

import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ebe extends l08 implements bz7 {
    public static final ebe E = new ebe(1);

    @Override // defpackage.g92, defpackage.ll9
    public final String getName() {
        return "isSynthetic";
    }

    @Override // defpackage.g92
    public final fm9 getOwner() {
        return jce.a.b(Member.class);
    }

    @Override // defpackage.g92
    public final String getSignature() {
        return "isSynthetic()Z";
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        Member member = (Member) obj;
        member.getClass();
        return Boolean.valueOf(member.isSynthetic());
    }
}
