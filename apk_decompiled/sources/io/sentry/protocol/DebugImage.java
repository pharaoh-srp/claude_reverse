package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class DebugImage implements m2 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.m2
    public void serialize(q3 q3Var, a1 a1Var) throws IOException {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        if (this.uuid != null) {
            yVar.r("uuid");
            yVar.A(this.uuid);
        }
        if (this.type != null) {
            yVar.r("type");
            yVar.A(this.type);
        }
        if (this.debugId != null) {
            yVar.r("debug_id");
            yVar.A(this.debugId);
        }
        if (this.debugFile != null) {
            yVar.r("debug_file");
            yVar.A(this.debugFile);
        }
        if (this.codeId != null) {
            yVar.r("code_id");
            yVar.A(this.codeId);
        }
        if (this.codeFile != null) {
            yVar.r("code_file");
            yVar.A(this.codeFile);
        }
        if (this.imageAddr != null) {
            yVar.r("image_addr");
            yVar.A(this.imageAddr);
        }
        if (this.imageSize != null) {
            yVar.r("image_size");
            yVar.z(this.imageSize);
        }
        if (this.arch != null) {
            yVar.r("arch");
            yVar.A(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.unknown.get(str);
                yVar.r(str);
                yVar.x(a1Var, obj);
            }
        }
        yVar.p();
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setImageSize(long j) {
        this.imageSize = Long.valueOf(j);
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setImageSize(Long l) {
        this.imageSize = l;
    }
}
