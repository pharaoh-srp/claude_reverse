package defpackage;

import androidx.javascriptengine.IsolateTerminatedException;
import androidx.javascriptengine.MemoryLimitExceededException;
import androidx.javascriptengine.SandboxDeadException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ep1 {
    public final /* synthetic */ int a;
    public String b;
    public int c;

    public ep1(byte[] bArr, fnf[] fnfVarArr) {
        this.a = 3;
        Objects.requireNonNull(bArr);
        this.b = null;
        this.c = 1;
    }

    public static t f() {
        t tVar = new t();
        tVar.a = 0;
        return tVar;
    }

    public String a(int i) {
        return this.b.substring(i, this.c);
    }

    public String b() {
        int i = this.c;
        if (i == 0) {
            return this.b;
        }
        StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        String str = "ArrayBuffer";
        if (i == 0) {
            str = "String";
        } else if (i != 1) {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" expected, but got ");
        sb.append("String");
        throw new IllegalStateException(sb.toString());
    }

    public boolean c(char c) {
        return this.b.charAt(this.c) == c;
    }

    public boolean d(String str) {
        return i().startsWith(str);
    }

    public boolean e() {
        return this.c < this.b.length();
    }

    public int g() {
        return this.b.codePointAt(this.c);
    }

    public int h() {
        int iCodePointAt = this.b.codePointAt(this.c);
        this.c = Character.charCount(iCodePointAt) + this.c;
        return iCodePointAt;
    }

    public String i() {
        return this.b.substring(this.c);
    }

    public void j(int i) {
        this.c += i;
    }

    public IsolateTerminatedException k() {
        int i = this.c;
        return i != 2 ? i != 3 ? new IsolateTerminatedException(toString()) : new MemoryLimitExceededException(toString()) : new SandboxDeadException(toString());
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return i();
            case 2:
                StringBuilder sb = new StringBuilder();
                int i = this.c;
                sb.append(i != 1 ? i != 2 ? i != 3 ? grc.p(i, "unknown error code ") : "memory limit exceeded" : "sandbox dead" : "unknown error");
                sb.append(": ");
                sb.append(this.b);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public ep1(int i, String str) {
        this.a = 2;
        this.c = i;
        this.b = str;
    }

    public ep1(String str, fnf[] fnfVarArr) {
        this.a = 3;
        this.b = str;
        this.c = 0;
    }

    public ep1(String str, int i) {
        this.a = 4;
        this.b = str;
        this.c = i;
    }

    public ep1(String str) {
        this.a = 1;
        this.c = 0;
        this.b = str;
    }
}
