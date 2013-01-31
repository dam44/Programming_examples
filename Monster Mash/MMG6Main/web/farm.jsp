<jsp:useBean id="usercontroller" class="monsterMashGroupProject.UserController" scope="session"/>
<jsp:useBean id="shp" class="monsterMashGroupProject.ShopController" scope="session"/>
<jsp:include page="includes/header.jsp"/>
<jsp:include page="includes/sidebar.jsp" />
<!-- Body Content -->
<h2>Farm</h2>
<table class="table table-striped table-bordered">
    <thead>
        <tr>
            <th width="120px">Monster</th>
            <th>Name</th>
            <th>Age</th>
            <th>Height</th>
            <th>Strength</th>
            <th>Aggression</th>
            <th>Breed?</th>
        </tr>
    </thead>
    <tbody>
        <% for (int i = 0; i < usercontroller.getNumOfMonsters(); i++) {%>
        <tr>
            <td><img src="http://bbrks.me/221/monsterid.php?seed=1"></td>
            <td><%= usercontroller.getMonster(i).getName()%></td>
            <td><%= usercontroller.getMonster(i).getAge()%></td>
            <td><%= usercontroller.getMonster(i).getHeight()%></td>
            <td><%= usercontroller.getMonster(i).getStrength()%></td>
            <td><%= usercontroller.getMonster(i).getAggression()%></td>
            <td><%= i%> </td>
        </tr>
        <%}%>
    </tbody>
    <tfoot>
        <tr>
            <td colspan="6"></td>
            <td>  <FORM name="first" METHOD=POST ACTION="Bread.jsp">
                    Monster 1: <INPUT TYPE=TEXT NAME=choice1 SIZE=20><BR>
                    Monster 2: <INPUT TYPE=TEXT NAME=choice2 SIZE=20><BR>
                    Name of Child: <INPUT TYPE=TEXT NAME=childName SIZE=20><BR>
                    <P><INPUT TYPE=SUBMIT VALUE="Breed"></p>
                </form>
            </td>
        </tr>
    </tfoot>
</table>
<jsp:include page="includes/sidebarclose.jsp" />
<jsp:include page="includes/footer.jsp" />
