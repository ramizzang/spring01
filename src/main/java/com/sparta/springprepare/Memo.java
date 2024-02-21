package com.sparta.springprepare;

// @Getter
// @Setter
// @AllArgsConstructor
// @NoArgsConstructor
// @RequiredArgsConstructor
public class Memo {
    private String username;
    private String contents;

    // 롬복이 자동으로 생성해 주는 것.
    public String getContents() { //@Getter
        return contents;
    }

    public void setContents(String contents) { //@Setter
        this.contents = contents;
    }

    public Memo(String username, String contents) { //@AllArgsConstructor
        this.username = username;
        this.contents = contents;
    }

    public Memo() { //@NoArgsConstructor
    }

    public Memo(String username) { //@RequiredArgsConstructor
        this.username = username;
    }

}

class main{
    public static void main(String[] args) {
        Memo memo = new Memo();
        memo.setContents("롬복으로 세팅, 롬복으로 다시 가져올거");
        System.out.println(memo.getContents());
    }
}

