package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class s92 extends fa2 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s92(Member member, Type type, Class cls, Type[] typeArr, int i) {
        super(member, type, cls, typeArr);
        this.e = i;
    }

    @Override // defpackage.q92
    public final Object call(Object[] objArr) {
        int i = this.e;
        Member member = this.a;
        objArr.getClass();
        switch (i) {
            case 0:
                tvj.b(this, objArr);
                wig wigVar = new wig(2);
                wigVar.b(objArr);
                wigVar.a(null);
                ArrayList arrayList = wigVar.a;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                tvj.b(this, objArr);
                return ((Constructor) member).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
