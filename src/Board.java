import java.util.List;
import java.util.Objects;

import BST.BinarySearchTree;

public class Board {
    private int id;
    private static int instanceCount = 0;
    private List<IssueList> listOfIssueList;
    private BinarySearchTree<User> members;

    public Issue searchIssue(String issueTitle) {
        for (IssueList issueList : listOfIssueList) {
            Issue found = issueList.searchInIssueList(issueTitle);
            if (found != null)
                return found;
        }
        return null;
    }

    public boolean addIssue(Issue issue, int index) {
        if (index < listOfIssueList.size()) {
            return listOfIssueList.get(index).addIssue(issue);
        }
        return false;
    }

    public boolean removeIssue(Issue issue, int index) {
        if (index < listOfIssueList.size()) {
            return listOfIssueList.get(index).deleteIssue(issue);
        }
        return false;
    }

    public BoardMember searchMember(BoardMember target) {
        return (BoardMember) members.find(target);
    }

    public boolean addMember(BoardMember member) {
        return members.add(member);
    }

    public boolean removeMember(BoardMember member) {
        return members.remove(member);
    }

    public Board() {
        this.id = ++instanceCount;
    }

    public Board(List<IssueList> issues, BinarySearchTree<User> members) {
        this();
        this.listOfIssueList = issues;
        this.members = members;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<IssueList> getIssues() {
        return this.listOfIssueList;
    }

    public BinarySearchTree<User> getMembers() {
        return this.members;
    }

    public Board id(int id) {
        setId(id);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Board)) {
            return false;
        }
        Board board = (Board) o;
        return id == board.id && Objects.equals(listOfIssueList, board.listOfIssueList)
                && Objects.equals(members, board.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, listOfIssueList, members);
    }

    @Override
    public String toString() {
        // TODO: refactor according to menu design
        return "{" +
                " id='" + getId() + "'" +
                ", issues='" + getIssues() + "'" +
                ", members='" + getMembers() + "'" +
                "}";
    }

}